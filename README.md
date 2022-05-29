# ```Spring Framework```

Spring container is the predefined program which is availbe with Spring.

**Spring IoC Container** is responsible for whole lifecycle of object - creation, hold them in memory, inject them in another object as required.

We have to give **Beans** and **Config** to the Spring container.

**ApplicationContext** interface represents our Spring Container. It extends **BeanFactory.**

```Subclass of ApplicationContext are```
- ClasspathXMLApplicationContext - search for xml configuration file from java class path
- AnnotationConfigApplicationContext 
- FileSystemXMLApplicationContext

#### Dependency injection can be done in two ways:
1. Setter injection - sometimes called Property injection also
2. Constructor injection

> the class which we provide to IoC containers are called **Beans**. We use xml **configuration file** to give those information of our class.
- configuration file - where we declare beans and its dependency

### ```Spring LifeCycle methods```
Spring provides two important methods to every **bean**.
1. public void init()
2. public void destroy()

**AbstractApplicationContext** has **registerShutdownHook()** method for destroying application context

**<<context:annotation-config>>** inside xml config file will enable all the annotations in spring context

