/*************************************************************************************************************
 * 

 * @purpose	:Stop watch start time and stop time and calculate time between them
 * 
 * @author	:Minesh Mane
 * @version	:1.0
 * @since	: 11-04-2019
 */

package FunctionalPrograms;

import bridgeit.util.Utility;

public class StopWatch {

	public long startTime = 0;
	public long stopTime = 0;
	public long elapsed;

	// to start timer
	public void start() {
		startTime = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTime);
	}

	// to stop timer
	public void stop() {
		stopTime = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTime);
	}

	public long getElapsedTime() {
		elapsed = stopTime - startTime;
		return elapsed;
	}

	public static void main(String[] args) throws Exception {
		try {

			StopWatch stopWatch = new StopWatch();

			System.out.println("Press '1' to Start Time: ");
			Utility.getIntNumber();
			stopWatch.start();

			System.out.println();
			System.out.println("Press '2' to Stop Time: ");
			Utility.getIntNumber();
			stopWatch.stop();

			long totalTime = stopWatch.getElapsedTime();
			System.out.println();
			System.out.println("Total Time Elapsed(in millisec) is:" + totalTime);
			System.out.println();
			System.out.println("Converting millisec to seconds: " + (totalTime / 1000) + " sec");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
