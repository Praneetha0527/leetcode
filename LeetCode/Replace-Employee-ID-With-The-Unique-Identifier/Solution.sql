1select u.unique_id, e.name
2from Employees e left join EmployeeUNI u on e.id = u.id;