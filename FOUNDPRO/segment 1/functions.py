# 3.04 Creating Functions 
# Purpose: Learining how to use functions
# 
# Author@ Shawn Velsor
# Date: 11/19/2020

import turtle

pen = turtle.Turtle()
wn = turtle.Screen()
pen.speed(100)

def main():
    print("Cheap House")
    pen.up()
    house()
    roof()
    

    

def roof():
    pen.goto(-50, 80)
    pen.left(90)

    #Roof
    pen.fillcolor("brown")
    pen.begin_fill()

    for i in range(2):
        pen.right(60)
        pen.forward(57)

    pen.right(150)
    pen.forward(90)
    pen.end_fill()


def house():
    pen.goto(-50,-20)
    pen.fillcolor("red")
    pen.begin_fill()

    # body of house
    for i in range(4):
        pen.forward(100)
        pen.left(90)
    pen.end_fill()

    pen.goto(-25,-20)
    pen.left(90)

    # door
    pen.fillcolor("brown")
    pen.begin_fill()
    for i in range(2):
        pen.forward(30)
        pen.right(90)
        pen.forward(25)
        pen.right(90)
    pen.end_fill()

    # window
    pen.goto(10, 10)
    pen.right(90)
    pen.fillcolor("blue")
    pen.begin_fill()
    for i in range(4):
        pen.forward(20)
        pen.right(90)
    pen.end_fill()


main()
turtle.done()