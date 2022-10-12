class arithemetic:
    def __init__(self,a,b):
        self.a=a
        self.b=b
    def addition(self):
        return self.a+self.b
    def subraction(self):
        return abs(self.a-self.b)
x=arithemetic(110,20)
x=x.subraction()
print(x)