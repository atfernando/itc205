package datamanagement;

/**
 *
 * @author akila
 */
public class UnitProxy implements IUnit {
<<<<<<< HEAD
private final String UC;
        private final String un;
=======
private String subjectCode;
        private String subjectName;
>>>>>>> origin/akila

        
        UnitManager   unitManager;

    /**
     *
     * @param unitCode
     * @param unitName
     */
    public UnitProxy( String unitCode, String unitName ) {
<<<<<<< HEAD
        this.UC = unitCode;
            this.un = unitName;
                um = UnitManager.UM(); }

    /**
     *
     * @return
     */
    @Override
    public String getUnitCode() { 
        return this.UC;}

    /**
     *
     * @return
     */
    @Override
        public String getUnitName() { 
            return this.un; 
        }

    /**
     *
     * @param cutoff
     */
    @Override
    public void setPsCutoff1(float cutoff) {
        um.getUnit(UC).setPsCutoff1(cutoff);
}

    /**
     *
     * @return
     */
    @Override
public float getPsCutoff() {
        return um.getUnit(UC).getPsCutoff();}

    /**
     *
     * @param cutoff
     */
    @Override
    public void setCrCutoff(float cutoff) {um.getUnit(UC).setCrCutoff(cutoff);
    }

    /**
     *
     * @return
     */
    @Override
    public float getCrCutoff() {
return um.getUnit(UC).getCrCutoff();
    }

    /**
     *
     * @param cutoff
     */
    @Override
public void setDiCutoff(float cutoff) {um.getUnit(UC).setDiCutoff(cutoff);}

    /**
     *
     * @return
     */
    @Override
    public float getDiCuttoff() {return um.getUnit(UC).getDiCuttoff();}

    /**
     *
     * @param cutoff
     */
    @Override
public void setHdCutoff(float cutoff) {
    um.getUnit(UC).setHdCutoff(cutoff);}

    /**
     *
     * @return
     */
    @Override
    public float getHdCutoff() {

        return um.getUnit(UC).getHdCutoff();}

    /**
     *
     * @param cutoff
     */
    @Override
public void setAeCutoff(float cutoff) {um.getUnit(UC).setAeCutoff(cutoff);
    }

    /**
     *
     * @return
     */
    @Override
    public float getAeCutoff() {return um.getUnit(UC).getAeCutoff();}

    /**
     *
     * @param f1
     * @param f2
     * @param f3
     * @return
     */
    @Override
public String getGrade(float f1, float f2, float f3) {
return um.getUnit(UC).getGrade(f1, f2, f3);
    }

    /**
     *
     * @param record
     */
    @Override
    public void addStudentRecord(IStudentUnitRecord record) 
{ 
um.getUnit(UC).addStudentRecord(record);
    }

    /**
     *
     * @param s
     * @return
     */
    @Override
    public IStudentUnitRecord getStudentRecord(int s) {return um.getUnit(UC).getStudentRecord(s);}

    /**
     *
     * @return
     */
    @Override
public StudentUnitRecordList listStudentRecords() {
    return um.getUnit(UC).listStudentRecords();
}

    /**
     *
     * @return
     */
    @Override
public int getAsg1Weight() {
	return um.getUnit(UC).getAsg1Weight();
}

    /**
     *
     * @return
     */
    @Override
public int getAsg2Weight() {
	return um.getUnit(UC).getAsg2Weight();
}

    /**
     *
     * @return
     */
    @Override
public int getExamWeight() {
	return um.getUnit(UC).getExamWeight();
}

    /**
     *
     * @param asg1Wgt
     * @param asg2Wgt
     * @param examWgt
     */
    @Override
public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt) {
	um.getUnit(UC).setAssessmentWeights(asg1Wgt, asg2Wgt, examWgt);
=======
        
        this.subjectCode = unitCode;
        this.subjectName = unitName;
                
        unitManager = UnitManager.UM(); }
    
    public String getUnitCode() { 
        return this.subjectCode;}
        
    public String getUnitName() { 
            return this.subjectName; 
        }
    public void setPassCutoff(float cutoff) {
        unitManager.getUnit(subjectCode).setPassCutoff(cutoff);

    }
    

    public float getPassCutoff() {
        
        return unitManager.getUnit(subjectCode).getPassCutoff();}
    
    public void setCreditCutoff(float cutoff) {unitManager.getUnit(subjectCode).setCreditCutoff(cutoff);
    }
    
    public float getCreditCutoff() {
        

        return unitManager.getUnit(subjectCode).getCreditCutoff();
    }


    public void setDistinctionCutoff(float cutoff) {
        unitManager.getUnit(subjectCode).setDistinctionCutoff(cutoff);
    }
    
    public float getDistinctionCutoff() {
        return unitManager.getUnit(subjectCode).getDistinctionCutoff();
    }

    public void setHighDistinctionCutoff(float cutoff) {
    unitManager.getUnit(subjectCode).setHighDistinctionCutoff(cutoff);
    }
    
    public float getHighDistinctionCutoff() {

        return unitManager.getUnit(subjectCode).getHighDistinctionCutoff();
    }

    public void setAlternativeExitCutoff(float cutoff) {
        unitManager.getUnit(subjectCode).setAlternativeExitCutoff(cutoff);
    }
    
    public float getAlternativeExitCutoff() {
        return unitManager.getUnit(subjectCode).getAlternativeExitCutoff();
    }

    public String getGrade(float f1, float f2, float f3) {

        return unitManager.getUnit(subjectCode).getGrade(f1, f2, f3);
    }
    
    public void addStudentRecord(IStudentUnitRecord record) { 

        unitManager.getUnit(subjectCode).addStudentRecord(record);
    }
    
    public IStudentUnitRecord getStudentRecord(int s) {
        return unitManager.getUnit(subjectCode).getStudentRecord(s);
    }

    public StudentUnitRecordList listStudentRecords() {
    return unitManager.getUnit(subjectCode).listStudentRecords();

    }

    public int getAssignment1Weight() {
	return unitManager.getUnit(subjectCode).getAssignment1Weight();

    }

    public int getAssignment2Weight() {
	return unitManager.getUnit(subjectCode).getAssignment2Weight();

    }

    public int getExamWeight() {
	return unitManager.getUnit(subjectCode).getExamWeight();

    
    }

    public void setAssessmentWeights(int assignment1Weight, int assignment2Weight, int examWeight) {
	unitManager.getUnit(subjectCode).setAssessmentWeights(assignment1Weight, assignment2Weight, examWeight);
>>>>>>> origin/akila
	

    }
}
