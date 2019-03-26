class Rule
{
	private int id;
	private int prio;
	private ArrayList<String> conditions;
	private int partial;
	private String conc;
	private int idConc;
	
	public void setId(int i)
	{
		id = i;
	}
	
	public void setPriority(int p)
	{
		prio = p;
	}
	
	public void setConditions(ArrayList<String> cond)
	{
		conditions = cond;
	}
	
	public void setPartialFlag(int p)
	{
		partial = p;
	}
	
	public void setConclusion(String c)
	{
		conc = c;
	}
	
	public void setConclusionId(int ic)
	{
		idConc = ic;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getPriority()
	{
		return prio;
	}
	
	public int getNoOfConditions()
	{
		return conditions.size();
	}
	
	public String getCondTextFromIndex(int index)
	{
		return conditions.get(index);
	}
	
	public int getPartialFlag()
	{
		return partial;
	}
	
	public String getConclusion()
	{
		return conc;
	}
	
	public int getConclusionId()
	{
		return idConc;
	}
}