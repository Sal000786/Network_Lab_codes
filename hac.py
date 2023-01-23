sal=[]
list1=[]
n =int(input("Enter the no of seq: "))
for i in range(n):
    cmd=input("Enter the command: ")
    list1.insert(0,cmd)
    # print("the command is",list1)

    if cmd=="append":
        value=int(input("enter a value to append: "))
        sal.append(value)
        # print(sal)
    if cmd=="pop":
        sal.pop()
    if cmd=="reverse":
        sal.reverse()
    if cmd=="remove":
        sal.remove(i)

    if cmd=="sort":
        sal.sort()
    if cmd=="insert":
        value=int(input("enter a value to insert: "))
        sal.insert(i,value)
    if cmd=="print":
        print(sal)
print(sal)