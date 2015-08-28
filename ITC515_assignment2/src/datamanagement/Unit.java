
package datamanagement;

/**
 *
 * @author Akila
 */

public final class Unit implements IUnit {
    //Implementing variables.
    //UC and Un as final; because those variables has to be constannt.
    
	private final String uc;
	private final String UN;
	private float co2;
	private float co1;
	private float co4;
	private float co3;
	private float co5;
	private int a1, a2, ex;
	
	private final StudentUnitRecordList rs;

	public Unit(String UC, String un, float f1, float f2, float f3, float f4,
			float f5, int i1, int i2, int i3, StudentUnitRecordList rl) {

		uc = UC;
		UN = un;
		co2 = f1;
		co1 = f2;
		this.co4 = f3;
		co3 = f4;
		this.co5 = f5;
		this.setAssessmentWeights(i1, i2, i3);
		rs = rl == null ? new StudentUnitRecordList() : rl;
	}

    /**
     *
     * @return UnitCode
     * Implements method from IUnit
     */
    @Override
	public String getUnitCode() {
		return this.uc;
	}

    /**
     *
     * @return UnitName
     * Implements method from IUnit
     */
    @Override
	public String getUnitName() {

		return this.UN;
	}

<<<<<<< HEAD
    /**
     *Setter method for PsCutoff1
     * @param cutoff:float
     * Implements method from IUnit
     */
    @Override
	public void setPsCutoff1(float cutoff) {
		this.co2 = cutoff;
	}

    /**
     * getter method for PsCutoff
     * @return
     * Implements method from IUnit
     */
    @Override
	public float getPsCutoff() {
		return this.co2;
	}

    /**
     *setter method for CrCutoff
     * @param cutoff:float
     * Implements method from IUnit
     */
    @Override
	public void setCrCutoff(float cutoff) {
		this.co1 = cutoff;
	}

    /**
     *getter method for CrCutoff
     * @return CrCutoff as float
     * Implements method from IUnit
     */
    @Override
	public float getCrCutoff() {
		return this.co1;
	}

    /**
     *Setter method for DiCutoff
     * @param cutoff:float
     * Implements method from IUnit
     */
    @Override
	public void setDiCutoff(float cutoff) {
		this.co4 = cutoff;
	}

    /**
     *getter method for DiCuttoff
     * @return DiCuttoff as float
     * Implements method from IUnit
     */
    @Override
	public float getDiCuttoff() {
		return this.co4;
	}
/**
     *Setter method for HDCutoff
     * We do have a another setter for HDCutoff; method call setHDCutoff
     * We don't need this method to set HDCutoff again
     * @param HDCutoff
     
        
	public void HDCutoff(float cutoff) {
		this.co3 = cutoff;
	}
*/
        
    /**
     *setter method for setHDCutoff
     * @param cutoff:float
     * Implements method from IUnit
     */
    @Override
	public void setHdCutoff(float cutoff) {
		this.co3 = cutoff;
	}

    /**
     *getter method for HdCutoff
     * @return HdCutoff as float
     * Implements method from IUnit
     */
    @Override
	public float getHdCutoff() {
=======
	public void setPassCutoff(float cutoff) {
		this.co2 = cutoff;
	}

	public float getPassCutoff() {
		return this.co2;
	}

	public void setCreditCutoff(float cutoff) {
		this.co1 = cutoff;
	}

	public float getCreditCutoff() {
		return this.co1;
	}

	public void setDistinctionCutoff(float cutoff) {
		this.co4 = cutoff;
	}

	public float getDistinctionCutoff() {
		return this.co4;
	}

	public void HighDistinctionCutoff(float cutoff) {
		this.co3 = cutoff;
	}

	public void setHighDistinctionCutoff(float cutoff) {
		this.co3 = cutoff;
	}

	public float getHighDistinctionCutoff() {
>>>>>>> origin/akila
		return this.co3;

	}

<<<<<<< HEAD
    /**
     *setter method for AeCutoff
     * @param cutoff:float
     * Implements method from IUnit
     */
    @Override
	public void setAeCutoff(float cutoff) {
		this.co5 = cutoff;
	}

    /**
     *getter method for AeCutoff
     * @return AeCutoff as float
     * Implements method from IUnit
     */
    @Override
	public float getAeCutoff() {
=======
	public void setAlternativeExitCutoff(float cutoff) {
		this.co5 = cutoff;
	}

	public float getAlternativeExitCutoff() {
>>>>>>> origin/akila
		return this.co5;
	}

    /**
     *This method for to add a new student record.
     * @param record:StudentUnitRecord
     * Implements method from IUnit
     */
    @Override
	public void addStudentRecord(IStudentUnitRecord record) {
		rs.add(record);
	}

    /**
     *This method to get student records which is saved before
     * @return student record as IStudentUnitRecord
     * Implements method from IUnit
     * @param studentID:int
     */
    @Override
	public IStudentUnitRecord getStudentRecord(int studentID) {
		for (IStudentUnitRecord r : rs) {
			if (r.getStudentId() == studentID)
				return r;
		}
		return null;
	}

    /**
     * Implements method from IUnit
     * @return StudentRecords:StudentUnitRecordList
     */
    @Override
	public StudentUnitRecordList listStudentRecords() {
		return rs;
	}

<<<<<<< HEAD
    /**
     *Implements method from IUnit
     * @return Asg1Weight:int
     */
    @Override
	public int getAsg1Weight() {
		return a1;
	}

    /**
     *Implements method from IUnit
     * @return Asg2Weight:int
     */
    @Override
	public int getAsg2Weight() {
=======
	@Override
	public int getAssignment1Weight() {
		return a1;
	}

	@Override
	public int getAssignment2Weight() {
>>>>>>> origin/akila
		return a2;
	}

    /**
     *Implements method from IUnit
     * @return ExamWeight:int
     */
    @Override
	public int getExamWeight() {
		return ex;
	}

    /**
     *Implements method from IUnit
     * @param a1
     * @param a2
     * @param ex
     * Implements method from IUnit
     */
    @Override
	public void setAssessmentWeights(int a1, int a2, int ex) {
		if (a1 < 0 || a1 > 100 ||
			a2 < 0 || a2 > 100 ||
			ex < 0 || ex > 100 ) {
			throw new RuntimeException("Assessment weights cant be less than zero or greater than 100");
		}			
		if (a1 + a2 + ex != 100) {
			throw new RuntimeException("Assessment weights must add to 100");
		}
		this.a1 = a1;
		this.a2 = a2;
		this.ex = ex;			
	}
        
        /*
        setCutoffs Method never called; This method is just a waste of memory
	
	private void setCutoffs( float ps, float cr, float di, float hd, float ae) {
		if (ps < 0 || ps > 100 ||
			cr < 0 || cr > 100 ||
			di < 0 || di > 100 ||
			hd < 0 || hd > 100 ||
			ae < 0 || ae > 100 ) {
			throw new RuntimeException("Assessment cutoffs cant be less than zero or greater than 100");
		}
		if (ae >= ps) {
			throw new RuntimeException("AE cutoff must be less than PS cutoff");
		}
		if (ps >= cr) {
			throw new RuntimeException("PS cutoff must be less than CR cutoff");
		}
		if (cr >= di) {
			throw new RuntimeException("CR cutoff must be less than DI cutoff");
		}
		if (di >= hd) {
			throw new RuntimeException("DI cutoff must be less than HD cutoff");
		}

	}
        */
	
    /**
     *Implements method from IUnit
     * @param f1:float
     * @param f2:float
     * @param f3:float
     * @return Grade as a string
     */
    @Override
	public String getGrade(float f1, float f2, float f3) {
		float t = f1 + f2 + f3;
		
		if (f1 < 0 || f1 > a1 ||
			f2 < 0 || f2 > a2 ||
			f3 < 0 || f3 > ex ) {
			throw new RuntimeException("marks cannot be less than zero or greater than assessment weights");
		}

		if (t < co5) {
			return "FL";
		} else if (t < co2)
			return "AE";
		else if (t < co1)
			return "PS";
		else if (t < co4)
			return "CR";
		else if (t < co3)
			return "DI";
		else
			return "HD";
	}

	
}
