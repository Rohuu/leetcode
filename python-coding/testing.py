# print
print("hello there")

# loop
for i in range(2, 5):
    print(i)

# nested loop
for i in range(0, 5):
    for j in range(0, 5):
        # print(i + " " + j)  can't do this in python coz of unsupported type 'int' and 'str'
        print(str(i)+" "+str(j))

# string methods
course = "Python For Beginners"
print(course.upper())
print(course.find("For"))
print(course.replace('r', '%'))
print('python' in course)
print(10+3)
print(10/3)     # gives float val
print(10//3)    # gives integer val
print(10*3)
print(4**3)     # power of

temp = 44
if (temp == 43):        # or we can write  if(temp is not 43) or if temp is not 43:
    print("It's 43")
elif temp > 50:
    print("Very harsh weather")
else:
    print("I've learnt conditionals")


# Exercise

weight = int(input("Enter your weight: "))
unit = input("Is it in Kg or Lbs, press K for kg or L for lbs: ")

if (unit.upper() == 'K'):
    weight_in_lbs = weight / 0.45
    print("Your weight in lbs is: " + str(weight_in_lbs))
else:
    weight_in_kg = weight * 0.45
    print("Your weight in kg is: " + str(weight_in_kg))

# multipling number with string
i = 1
while i <= 10:
    # we can multiply any string with number, It will repeat that string
    print(i*'*')
    i = i+1

# list
names = ["Rohit", "Sachin", "Kamal", "Sagar", "Pankaj"]
print(names)
print(names[0])
print(names[1])
print(names[-1])  # means last index
print(names[-2])  # means second last index
names[0] = "Changed_Name"
print(names)

# prints all elements between [0,3) including first element & excluding second element
print(names[0:1])

# methods in a list
nums = [1, 2, 3, 4, 5]
print(nums)
nums.append(77)
nums.append(100)
print(nums)
nums.remove(77)     # removes particular item from list
print(nums)

# returns boolean expression whether a particular number is present in list or not
print(54 in nums)
print(100 in nums)

# returns length of list
print(len(nums))

nums.clear()    # clears all the items from list
print(nums)

# loops
# for_loop
numbers = [9, 7, 8, 6, 5, 4]
for number in numbers:
    print(number)

# while_loop
i = 0
while i < len(numbers):
    print(numbers[i]+5)
    i += 1

# range()
items = range(9)     # will store [0,9)
for item in items:
    print(item)

moreItems = range(5, 9)     # will store [5,9)
for item in moreItems:
    print(item)

yetMoreItems = range(5, 15, 2)     # will store [5,9) with gap of 2
for item in yetMoreItems:
    print(item)

for item in range(5, 12):
    print(item*100)

# tuple: tuples are immutable in python
# we can't modify tuple in python
numbers = (1, 2, 3, 4, 5)
print(numbers.count(3))     # returns the count of a value

# dictionary
# it is to store a key:value pair data structure in python same like hashmap in java
cars={
"brand":"ford",
"model":"AX67RE",
"year":1876
}

print(cars)
print(len(cars))