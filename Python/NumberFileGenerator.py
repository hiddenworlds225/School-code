import io
import random

file = open("numbers.txt", "w+")

for x in range(10):
    num = random.randint(0, 100)
    file.write(str(num) + "\n")

file.close()
