# spring-mvc
getting started spring mvc with DD(Deployment Descriptor) ver2.5

1. create a new project with Dynamic Web Project (DD ver2.5).
2. covert project to maven. (right click on Project -> Configure)
3. add Spring Project Nature. (right click on Project -> Spring Tools)
4. add dependencies in pom.xml
5. create spring configuration files.
6. update your DD file with condition #5.
7. create java, jsp files.
8. run with tomcat

# nextstep: getting started mybatis
 
getting started with mybatis on this project

1. add mybatis, mybatis-spring, spring-jdbc dependencies on pom.xml
<pre>
&lt;dependency&gt;
 		&lt;groupId&gt;org.mybatis &lt;/groupId&gt;
		&lt;artifactId&gt;mybatis &lt;/artifactId&gt;
		&lt;version&gt;3.4.2 &lt;/version&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
		&lt;groupId&gt;org.mybatis &lt;/groupId&gt;
		&lt;artifactId&gt;mybatis-spring &lt;/artifactId&gt;
		&lt;version&gt;1.3.0 &lt;/version&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
		&lt;groupId&gt;org.springframework &lt;/groupId&gt;
		&lt;artifactId&gt;spring-jdbc &lt;/artifactId&gt;
		&lt;version&gt;4.1.0.RELEASE &lt;/version&gt;
&lt;/dependency&gt;
</pre>

2. open spring-controller.xml spring bean configuration file
3. add xmlns: context and xsi:schemaLocation about spring-beans, spring-context
4. add  &lt;context:annotation-config/&gt; and beans (datasource, sqlSesscionFactory, sqlSession, user DAO etc…)