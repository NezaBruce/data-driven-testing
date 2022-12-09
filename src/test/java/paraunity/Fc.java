package paraunity;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import praunit.Ftem;

@Test
public class Fc {
	@DataProvider Object[][] nbofGameswon(){
		return new Object[][] {{0},{1},{2}};
		};
//	private final static int gamnum = 4;
	@Test(dataProvider = "nbofGameswon")
public void contructorshoulstit(int nbofGameswon) {
	Ftem team=new Ftem(nbofGameswon);
	assertEquals(team.getGameswon(),nbofGameswon, nbofGameswon + " games were passed, but " 
	+ team.getGameswon() + " were returned"
	);	
	}
	
	@DataProvider Object[][] illegalnbofGameswon(){
		return new Object[][] {{-10},{-1}};
		};
@Test(dataProvider = "illegalnbofGameswon",expectedExceptions=IllegalArgumentException.class)		
public void shouldThrowExp(int illegalnbofGameswon) {	
	new Ftem(illegalnbofGameswon);
}
private static final int anynumbr =123; 
public void shouldbepossibletocompareteam(){
	Ftem team = new Ftem(anynumbr); 
	assertTrue(team instanceof Comparable,"Fteam should implement");
	}
@Test 
public void teamsWithMorematchwonshouldbegreater(){
	Ftem team2 = new Ftem(2);
	Ftem team3 = new Ftem(3); 
//	assertTrue(team3.compareTo(team2) > 0);
	assertTrue(team2.compareTo(team3) < 0,"Teams with " + team2.getGameswon() + " shoul be ranked after team with " + team3.getGameswon());
}
@Test 
public void teamsWithequalmatch(){
	Ftem team2 = new Ftem(2);
	Ftem team3 = new Ftem(2); 
//	assertTrue(team3.compareTo(team2) > 0);
	assertTrue(team2.compareTo(team3) == 0,"Teams with " + team2.getGameswon() + " shoul be ranked after equal with " + team3.getGameswon());
}	
}
