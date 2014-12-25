
public class SimpleReflexAgent {
	public int myLocation;
	public int myWorldSize;
	
	public SimpleReflexAgent(int location, int worldSize){
		myLocation = location;
		myWorldSize = worldSize;
	}
	
	public int getLocation(){
		return myLocation;
	}
	
	public int getWorldSize(){
		return myWorldSize;
	}
	
	/*
	 * move the agent to the right one tile
	 * @param
	 * @return void
	 */
	public void moveRight(){
		if((myLocation + 1) < myWorldSize){
			myLocation++;
		}
	}
	
	/*
	 * move the agent to the left one tile
	 * @param
	 * @return void
	 */
	public void moveLeft(){
		if(myLocation > 0){
			myLocation--;
		}
	}
}
