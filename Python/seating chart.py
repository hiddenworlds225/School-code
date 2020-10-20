
numKids = 0
seatRow = 0
seatNumber = 0
studentDict = dict()
studentRow = dict()
numRows = int(input("How many rows? "))
numSeats = int(input("How many seats per row? "))

#Debug Code
#numRows = 3
#numSeats = 5


x = 0
while x <= numRows:
    #Forced my hand a bit, as I need to use len() in a couple places. I'll just use
    #values that they cannot or should not use.

    studentRow[x] = [-1, 0]

    x += 1

#Test Group
def TestStudents():
    studentDict['Dave'] = ['Dave', 1, 1, 0]
    studentDict['Luke'] = ['Luke', 1, 2, 0]
    studentDict['Kathy'] = ['Kathy', 1, 3, 0]
    studentDict['Dizzy'] = ['Dizzy', 2, 1, 0]
    studentDict['Memes'] = ['Memes', 3, 5, 0]
    studentDict['Dan'] = ['Dan', 3, 1, 0]
    studentDict['Nick'] = ['Nick', 1, 4, 0]
    

def AddStudent():
    name = input("What is the kid's name? ")

#Keep inside the bounds of max rows.

    seatRow = int(input("What row do they sit in? "))
    while seatRow > numRows or seatRow <= 0:
        print("Invalid row. There are only", numRows, "Row(s) in the program. Please input again.")
        seatRow = int(input("What is the valid seat row? "))

#Fix the range into the correct position

    seatsUsed = len(studentRow[seatRow])- 2

#Prevent adding to full rows
    while  seatsUsed == numSeats:
        print("Row is full!")
        seatRow = int(input("Give an open row: "))
        while seatRow > numRows:
            print("Invalid row. There are only", numRows, "Row(s) in the program. Please input again.")
            seatRow = int(input("What is the valid seat row? "))
        seatsUsed = len(studentRow[seatRow])- 2

#keep inside seat range.

    seatNumber = int(input("What number is their seat? "))
    while numSeats < seatNumber:
        print("Invalid seat. There are only", numSeats, "seat(s) per row in the program. Please input again. ")
        seatNumber = int(input("What is the valid seat number? "))

#Prevent multiple people from being in the same seat
    while seatNumber in studentRow[seatRow]:
        print("Seat already taken!")
        seatNumber = int(input("Input empty seat: "))
        while numSeats < seatNumber:
            print("Invalid seat. There are only", numSeats, "seat(s) per row in the program. Please input again. ")
            seatNumber = int(input("What is the valid seat number? "))

#How many absences?
    numAbsentces = int(input("How many times have they been absent? "))

#First one saves data, the other 

    studentDict[name] = [name, seatRow, seatNumber, numAbsentces]
    studentRow[seatRow].append(seatNumber)

    print("Student added")
    
    

#No longer in the def.
def PrintData():
    print(studentDict)
    for x in studentDict:
        print("Student Name:", x)
        print("Seat Row:", studentDict[x][1])
        print("Seat Number:", studentDict[x][2])
        print("Total absentces:", studentDict[x][3])
        print()



def PrintChart():
    isEmpty = True
    for x in range(1,numRows + 1):
        for y in range(1, numSeats + 1):
            for z in studentDict:
                if studentDict[z][1] == x and studentDict[z][2] == y:
                    print(z, end=' ')
                    isEmpty = False

            if isEmpty:
                print("*Empty*", end=' ')
            isEmpty = True
        print()
        


def InputRequest():
    request = input("What do you want to request? (type Help for commands) ")
    request = str.split(request, ' ')
    if request[0] == "Help":
        print("List of commands:\nHelp: brings this table up\nNames: Get a list of all names in the dictionary\n" +
        "Info <NAME>: Gives information on that student\nAdd: Allows you to add a student.\nRemove <NAME>: Removes a student.\n" +
        "Chart: Print Student Seating Chart.")
    if request[0] == "Info":
        if studentDict.get(request[1]) is not None:
            print("Student Name:", request[1])
            print("Row number:", studentDict[request[1]][1])
            print("Seat Number:", studentDict[request[1]][2])
            print("Total absences:", studentDict[request[1]][3])
        else:
            print("That Student doesn't exist!")
    if request[0] == 'Add':
        AddStudent()
    if request[0] == 'Remove':
        studentDict.pop(request[1])
        print("Student Removed")
    if request[0] == 'Chart':
        PrintChart()


while numKids < 10:
    AddStudent()
    numKids += 1
print()
#Commant out While loop if you want to go the manual way. Uncomment TestStudents() if you want to get names in fast.
#TestStudents()
PrintData()
PrintChart()

active = True
while active:
    InputRequest()