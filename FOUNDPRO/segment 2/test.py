# 6.01 Testing
#
# @Author Shawn Velsor
# @Date 3/2/2021
#


# Main function to use
def Main():
    print("Slope between two points")
    print("x1, y1   x2, y2  Slope")

# Use a nested array to use for coordinates
    xy1 = [[2, 5], [3.5, 4], [5, 5], [0, 2], [5, 0]]
    xy2 = [[4, 5], [1, -5], [10, 9], [-2, 0], [7, -2]]

# Calls for slope from other method; iterates through the length of xy1 array.
    for i in range(len(xy1)):
        print(str(xy1[i][0]) + ", " + str(xy1[i][1]) + "\t" + str(xy2[i][0]) + ", " + str(xy2[i][1]) + "\t" + str(CalcSlope(xy1[i], xy2[i])))


# Calculates slope using formula m = y2 - y1 / x2 - x1; returns slope (m)
def CalcSlope(xy1, xy2):
# xy1 and xy2 is just a normal array at this moment, so just call them by its index will be good enough
    m = (xy2[1] - xy1[1])/(xy2[0] - xy1[0])

    return m

# Call Main function
Main()