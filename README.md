# ```Spring Framework```

Spring container is the predefined program which is availbe with Spring.

**Spring IoC Container** is responsible for whole lifecycle of object - creation, hold them in memory, inject them in another object as required.

We have to give **Beans** and **Config** to the Spring container.

**ApplicationContext** interface represents our Spring Container. It extends **BeanFactory.**

```Subclass of ApplicationContext are```
- **ClasspathXMLApplicationContext** - search for xml configuration file from java class path
- **AnnotationConfigApplicationContext** 
- **FileSystemXMLApplicationContext**


