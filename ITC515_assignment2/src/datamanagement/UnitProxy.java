package datamanagement;

/**
 *
 * @author akila
 */
public class UnitProxy implements IUnit {
private final String UC;
        private final String un;

        
        UnitManager   um;

    /**
     *
     * @param unitCode
     * @param unitName
     */
    public UnitProxy( String unitCode, String unitName ) {
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
	
}}
