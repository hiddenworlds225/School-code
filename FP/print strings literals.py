#   
#
#   1.05 printing 
#   Ask for name and age, and print it for the user.
#   
#   Made by Shawn Velsor
#   9/29/2020
#

def main():

# Spaces inside the input are to allow the typed string to have some space away form the question.
# This was written in Visual Studio, and ran through the Command Line.

# Get name from person
    name = str(input("What is your name? "))

# Get the person's age
    age = str(input("How old are you? "))

# The commas also act as an + while adding a space to it!

# Had to force age to be a string, although it was already asked to be one. Main reason as to why is because 
# it only detected whole numbers, making it an interger no matter what. And it doesn't like using + with strings and ints!

# Print the user's name and age.
    print("your name is", name, "and your age is", str(age) + "!")
    
# Ask for their grade level.
    gradeLevel = str(input("What grade are you in? "))

# Print their name, age, and grade level.
    print("so your name is",  name, "and you are", age, "years old. Plus, you are in", gradeLevel, "Grade, nice!")

# Ask about if they have a hobby.
    hobby = str(input("What is your favorite hobby? "))

#print the hobby.
    print("You like", hobby + "? I like that too!")


main()