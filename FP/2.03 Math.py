# 2.03 Math
#
# We are using math to get the volume of a cube. 
#
# By Shawn Velsor
# 10/14/2020


# We are going to create a word problem, then do some stuff.

print("Little Timmy is learning how to get the volume of a cube. Unfortunately, he's struggling to understand how " +
"to get the volume of a cube. To show how easy it is for him to do such a thing, " +
"we will calculate the volume by adding 3 variables and calulating them.")

# Give the text some space...
print()

# First, we need the data for the length, width, and height; respectfully using x, y, and z.

x = float(input("Size for length: "))
y = float(input("Size for width: "))
z = float(input("Size for height: "))

print()

# Then adding it to a variable

cubeSize = x * y * z

# Now print the Data
# **I formatted this to work with the IDLE, so this should run just fine.

# For me, printing floats in a string is a no-no unless I convert it for that moment.
print("The cube's size is " + str(cubeSize) + " inches cubed.")