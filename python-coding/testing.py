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
print(4**3)     # power
