# 0 TestNgProj

testng测试框架学习实例 
* 官网：https://testng.org/doc/download.html
* maven库：https://mvnrepository.com/

# 1 idea运行testng

## 1.1 运行单个用例

在idea中，直接点击左侧运行按钮。或者鼠标选择用例，然后右键->run"xxx"(xxx为用例名)

## 1.2 运行一组用例
* 首先,通过testng.xml组织多个用例
* 然后，在testng.xml中右键->run".../xxx.ml"

```xml
<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Suite_TestMethods"  >
    <test name="testCase1">
        <classes>
            <class name="com.xnn.groupsTest.TestConfig"/>
            <class name="com.xnn.dao.UserInfoMapperTest">
                <methods>
                    <include name="testInsertUser"/>
                    <include name="testSelectByPrimaryKey"/>
                    <exclude name="testUpdateByPrimaryKey"/>
                </methods>
            </class>
        </classes>
    </test>
    <test name="testCase2">
        <classes>
            <class name="com.xnn.groupsTest.TestConfig"/>
            <class name="com.xnn.groupsTest.DatabaseTest"/>
        </classes>
    </test>

</suite>

```

