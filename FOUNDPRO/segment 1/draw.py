# Made by Shawn Velsor
# Date of creation: 10/19/2020
# Purpose of project: Learn how to use for loops

import turtle
from turtle import *
from turtle import Screen
import tkinter
from tkinter import *


root = Tk()
canvas = ScrolledCanvas(root)
canvas.pack(side=LEFT)
screen = TurtleScreen(canvas)
turtle = RawTurtle(canvas)

def main():
    for i in range(0, 36):
        turtle.forward(200)
        turtle.right(110)

main()