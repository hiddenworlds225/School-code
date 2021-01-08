# 2.06 Project
# 
# Author: Shawn Velsor
#
# Date of Creation: 10/19/2020


# We are doing the wishlist one.
# We need some sort of interaction.

# Allow the user to input text inputs. Sounds good enough.

# Maybe we can store this stuff inside a dictonary? Seems the best way.

# Note: 6.5% tax and $5.99 flat shipping rate.
# I'll apply the shipping rate after tax, makes it easier.

# ToDo:
# 1) Recieve input to add/remove/total
# 2) Create Functions to add/remove/give a full list
# 3) do math, output functions

# Initialize the necessary vars

wishDict = dict()

# Shove it into a while loop...
def main():

    # Use if statements, since python doesn't use a switch method...
    # I wish it did. Maybe I'll make my own in the future.
    command = input("Input your command, type 'help' to display all commands. ").lower() 
    # Converts it to lowercase, making it able to use commands regardless of capitalization.

    # Parse the string, it'll make using commands simpler if wanted.
    # Splits with the space key.
    com = command.split(" ")

    if com[0] == "help":
    # massive, but necessary.
        print("help: Display this.\nadd <itemName> <price>: adds an item. not adding an item makes the program " +
        "ask for the name and price of the item in hand. If an accident type 'cancel' in the item name.\n" +
        "remove <itemName>: Allows you to remove the item from the list.\ntotal: shows the list with all items " +
        "listed, their prices, tax, shipping, and total price.\n quit: if you're done with this, then yhea, exit program.")
    if com[0] == "add":
        # com length would just be 1 if it cannot parse anything
        # Set length to 2 to prevent errors.
        if len(com) > 2:
        # Name is key, price is value
            wishDict[com[1]] = com[2]
        else:
            item = input("What is the item name? ").lower()
            #if they type anything else than a number, the program crashes. Redundancy can be added, but that's too much time.
            price = float(input("What is the price? "))

            wishDict[item] = price
        print("Added item.")

    if com[0] == "remove":
        try:
            wishDict.pop(com[1])
            print("Removed item.")
        except KeyError:
            print("Item not found, dictionary is case sensitive.")        
        

    if com[0] == "total":
        print("Item Name:\tPrice(USD):")
        total = 0.00
        for x in wishDict:
            print(x + "\t" + "$" + str(wishDict[x]))
            total += float(wishDict[x])
        # Add tax
        total *= 0.65
        print("Tax: 6.5%")
        # Then shipping
        total += 5.99
        print("Shipping: $5.99 (Not taxed)")

        # Print results, and also round it in the process.
        print("Total:\t$" +  str(round(total, 2)))

    if com[0] == "quit":
        quit()

            
while True:
    main()