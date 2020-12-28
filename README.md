# springboot-composite-key


Querying using the Composite Primary Key
Let’s now see some query examples using the composite primary key -

1. Retrieving an Employee using the composite primary key - (employeeId and deptId)

// Retrieving an Employee Record with the composite primary key


```ruby

employeeRepository.findById(new EmployeePKId(200, 44));

```

2. Retrieving all employees of a particular Dept

Let’s say that you want to retrieve all the employees of a company by deptId. For doing this, just add the following method in the EmployeeRepository interface.

```ruby

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {
    /* 
       Spring Data JPA will automatically parse this method name 
       and create a query from it
    */
    List<Employee> findByEmployeePKIddeptId(String deptId);
}
```
