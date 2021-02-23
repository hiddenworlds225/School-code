# 5.04
#   Undestanding classes and methods
#
# @author Shawn Velsor
# @Date 2/22/2021

class Superhero:

        #All the print() is to create spaces instead of being one large block of text.

    def __init__(self, name = "", strengthPts = 0, coolPoints = 0, criminalsDefeated = 0):
        self.name = name
        self.strengthPts = strengthPts

        self.coolPoints = coolPoints
        self.criminalsDefeated = criminalsDefeated

    def addStrengthPts(self, points):
        print(self.name + " was awarded " + str(points) + " Strength Points!")
        self.strengthPts = self.strengthPts + points
        print(self.name + " now has " + str(self.strengthPts) + " Strength Points!")
    def saveWorld(self):
        print("He did it, " + self.name + " saved the world!")

        print()

        print(self.name + " also gained 200 Cool Points!")
        self.coolPoints += 200
        print("He now has, " + str(self.coolPoints) + " Cool Points!")

        print()

        self.criminalsDefeated += 1
        print("He also has defeated " + str(self.criminalsDefeated) + " criminals as of now.")

        print()

        self.addStrengthPts(200)


def Main():
    hero = Superhero("David", 100, 50, 80)
    print("The hero's name is " + hero.name + ".")
    print("He has " + str(hero.strengthPts) + " Strength Points,")
    print("including " + str(hero.coolPoints) + " Cool Points,")
    print("and has defeated " + str(hero.criminalsDefeated) + " Criminals!")
    print()
    print("Look, he's going to go save the world again!")
    print()
    print("....Sometime later....")
    print()
    hero.saveWorld()
    

Main()