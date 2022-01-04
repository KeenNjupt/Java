# 异常处理  

当不寻常的事情发生时，原本打算要接着做的事情不能再继续了，必须要停下来，让其他地方的某段代码来处理。  
异常机制的最大好处就是：清晰地分开了正常的业务逻辑代码和遇到情况时的处理代码。  

例子：读文件  
```
try{   // 业务逻辑
  open the file;  
  determin its size;  
  allocate that much memory;  
  read the  file into memory;  
  close the file;  
}catch(fileOpenFailed){  // 处理代码
    doSomething;  
}catch(sizeDeterminationFailed){  
    doSomething;  
}catch(memoryAllocationFailed){  
    doSomething;  
}catch(readFailed){  
    doSomething;  
}catch(fileCloseFailed){  
    doSomething;  
}  
```
