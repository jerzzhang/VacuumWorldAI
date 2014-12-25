
public class Simulator {
	public static void main (String[] args){
		int performanceScore = 0;
		VacuumWorld world = new VacuumWorld(2);
		SimpleReflexAgent agent = new SimpleReflexAgent(0, 2);
		System.out.println(world.toString());
		
		for(int i = 0; i < 1000; i++){
			if(!world.isClean(agent.getLocation())){
				world.clean(agent.getLocation());
				performanceScore += world.getPerformance();
			}
			else if(agent.getLocation() == 0){
				agent.moveRight();
				performanceScore += world.getPerformance();
			}
			else{
				agent.moveLeft();
				performanceScore += world.getPerformance();
			}
		}
		
		System.out.println(performanceScore);
	}
}
