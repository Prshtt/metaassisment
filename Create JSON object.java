  import org.json.JSONArray;
  import org.json.JSONObject;
  
  public class Create JSON object {

     JSONObject employeeData = new JSONObject();
              employeeData.put("fname", "abc");
              employeeData.put("lname", "xyz");
              employeeData.put("id", 1);
              JSONArray employees = new JSONArray();
             employees.put(employeeData);

    JSONObject employeeData2 = new JSONObject();
        employeeData2.put("fname", "abc");
        employeeData2.put("lname", "xyz");
        employeeData2.put("id", 2);
        employees.put(employeeData2);

    
    String firstName = employeeData.getString("fname");
        String lastName = employeeData.getString("lname");
          int empId = employeeData.getInt("id");
            employeeData.put("fname", "updated fname");
            employeeData.put("lname", "updated lname");
            employeeData.put("id", 3);
           
}
