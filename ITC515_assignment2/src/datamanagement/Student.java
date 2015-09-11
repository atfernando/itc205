package datamanagement;

public class Student implements IStudent {
    private Integer id; private String fn;
            private String ln;
private StudentUnitRecordList su;

public Student( Integer id, String fn, String ln, StudentUnitRecordList su ) { this.id = id; this.fn = fn;
        this.ln = ln;this.su = 
        su == null ? new StudentUnitRecordList() : 
                su;
}
// line indentation 
//changed variables
    public Integer getID() { return this.id; 
} public String getFirstName() { 
return fn; }
//changed variables
    public void setFirstName( String firstName ) { 
this.fn = firstName; }
//changed variables
public String getLastName() { 
    return ln; }
    public void setLastName( String lastName ) { 

//changed variables
this.ln = lastName; }

public void addUnitRecord( IStudentUnitRecord record ) { su.add(record); }
        public IStudentUnitRecord getUnitRecord( String unitCode ) {
for ( IStudentUnitRecord r : su ) 
            if ( r.getUnitCode().equals(unitCode)) 
return r; 

return null;
        
}

public StudentUnitRecordList getUnitRecords() { return su; }}
