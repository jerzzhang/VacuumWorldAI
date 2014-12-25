public class VacuumWorld {
	public int worldSize; //number of squares in the vacuum world
	public int[] world; //world in matrix form
	public int performance; //award one point for each clean square at each time step
	
	
	public VacuumWorld(int size){
		worldSize = size;
		world = new int[size];
		
		//randomize dirt placement and update current performance
		for(int i = 0; i < size; i++){
			if(Math.random() > 0.5){
				world[i] = 1;
			}
			else{
				world[i] = 0;
				performance++;
			}
		}
	}
	
	public int[] getWorld(){
		return world;
	}
	
	public int getWorldSize(){
		return worldSize;
	}
	
	public String toString(){
		StringBuilder a = new StringBuilder();
		
		for(int i = 0; i < worldSize; i++){
			a.append(world[i]);
		}
		return a.toString();
	}
	
	/*
	 * Clean the location given
	 * 
	 * @param location in the matrix
	 * @return void
	 */
	public void clean(int i){
		world[i] = 0;
		performance++;
	}
	
	/*
	 * Check if the tile is clean (0 = clean and 1 = dirty)
	 * 
	 * @oaram location in the matrix
	 * @return true if the tile is clean and false if the tile is dirty
	 */
	public boolean isClean(int i){
		if(world[i] == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getPerformance(){
		return performance;
	}
}
