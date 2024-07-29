import time
import requests
from datetime import datetime
import smtplib

MY_LAT = 20.593683  # from latlong website
MY_LONG = 78.962883
MY_EMAIL = "[SENDER EMAIL]"
A_PASSWORD = "[APP PASSWORD]"


def is_near():
    iss_response = requests.get(url='http://api.open-notify.org/iss-now.json')
    # print(iss_response.status_code)
    iss_response.raise_for_status()
    iss_data = iss_response.json()
    longitude = float(iss_data["iss_position"]["longitude"])
    latitude = float(iss_data["iss_position"]["latitude"])
    coordinates = (latitude, longitude)
    return (latitude + 5 <= MY_LAT <= latitude - 5) and (longitude + 5 <= MY_LONG <= longitude - 5)


def is_night():
    parameters = {
        "lat": MY_LAT,
        "lng": MY_LONG,
        "formatted": 0,
    }

    response = requests.get(url='https://api.sunrise-sunset.org/json', params=parameters)  # passing parameters to api
    data = response.json()
    sunrise = int(data["results"]["sunrise"].split("T")[1].split(":")[0])
    sunset = int(data["results"]["sunset"].split("T")[1].split(":")[0])

    time_now = datetime.now().hour
    if time_now <= sunrise or time_now >= sunset:
        return True


while True:
    time.sleep(60)
    if is_near() and is_night():
        with smtplib.SMTP("smtp.gmail.com") as connection:
            connection.starttls()
            connection.login(user=MY_EMAIL, password=A_PASSWORD)
            connection.sendmail(from_addr=MY_EMAIL,
                                to_addrs="[RECIPIENT EMAIL]",
                                msg="Subject:ISS\n\nLook up in the sky, ISS is above you"
                                )

# Status codes
# 1XX - Hold on
# 2XX - Here you go
# 3XX - Go away
# 4XX - You screwed up
# 5XX - I(server) screwed up
