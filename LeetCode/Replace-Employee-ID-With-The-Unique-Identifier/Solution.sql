1select u.unique_id as unique_id, e.name as name
2from Employees e left join EmployeeUNI u on e.id = u.id;