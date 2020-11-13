
#load from json file
import json

name = ""
age = 0
id = 0


def main():
    with open("info.json", "r") as file:
        data = json.load(file)
        for i in data:
            print("Name:", i["Name"])
            print("Age:", i["Age"])
            print("ID:", i["ID"])
            print()

main()