# 4.02 More Decisions
# Purpose: extending if statements
# 
# Author@ Shawn Velsor
# Date: 1/8/2021

import turtle

pen = turtle.Turtle()
wn = turtle.Screen()
pen.speed(5)

print("Welcome to the turtle system!")
print("------Controls------")
print("W: Forward")
print("S: Backwards")
print("A: Left")
print("D: Right")
print("U: Pen Up")
print("I: Pen Down")
print("O: Pen Speed")
print("C: Pen color")
print("Q: Quit")
print("--------------------")

running = True
exec = False

while running:
    control = input("What type of command do you want to use? ").lower()
    
    if(control == "w"):
        dist = int(input("how far do you want to go? "))
        pen.forward(dist)
        exec = True

    if(control == "a"):
        dist = int(input("how far do you want to rotate? "))
        pen.left(dist)
        exec = True

    if(control == "s"):
        dist = int(input("how far do you want to go? "))
        pen.backward(dist)
        exec = True

    if(control == "d"):
        dist = int(input("how far do you want to rotate? "))
        pen.right(dist)
        exec = True

    if(control == "u"):
        print("Pen is up")
        pen.up()
        exec = True

    if(control == "i"):
        print("Pen is down")
        pen.down()
        exec = True

    if(control == "o"):
        speed = int(input("how fast do you want to go? "))
        pen.speed(speed)
        exec = True

    if(control == "c"):
        col = input("Pick a valid color and type it. ")
        pen.pencolor(col)
        exec = True

    if(control == "q"):
        running = False
        exec = True
    if(exec == False):
        print("command not recognized")
    exec = False
