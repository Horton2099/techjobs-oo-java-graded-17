package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    private static final String newLine = System.lineSeparator();
    Job newJob1 = new Job("Trash Patrol", new Employer("A&B Cleaners"), new Location("Nevada"), new PositionType("Captain"), new CoreCompetency("Hawk-eyes"));
    @Test
    public void testSettingJobId() {
        Job newJob1 = new Job();
        Job newJob2 = new Job();
        assertNotEquals(newJob1, newJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        assertTrue(newJob1.getName() instanceof String);
        assertEquals("Trash Patrol", newJob1.getName());
        //checking employer
        assertTrue(newJob1.getEmployer() instanceof Employer);
        assertEquals("A&B Cleaners", newJob1.getEmployer().getValue());
        //checking location
        assertTrue(newJob1.getLocation() instanceof Location);
        assertEquals("Nevada", newJob1.getLocation().getValue());
        //checking positionType
        assertTrue(newJob1.getPositionType() instanceof PositionType);
        assertEquals("Captain", newJob1.getPositionType().getValue());
        //checking CoreCompetency
        assertTrue(newJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Hawk-eyes", newJob1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {

        Job newJob2 = new Job("Trash Patrol", new Employer("A&B Cleaners"), new Location("Nevada"), new PositionType("Captain"), new CoreCompetency("Hawk-eyes"));
        assertNotEquals(newJob1, newJob2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
//checking for empytline before/after using hasEmptyLineAfter/Before?
        String actualString = newJob1.toString();

        assertTrue(actualString.startsWith(newLine));
        assertTrue(actualString.endsWith(newLine));


        }
        @Test
        public void testToStringContainsCorrectLabelsAndData(){
            String testString = newLine + "ID: " + newJob1.getId() +
                newLine + "Name: Trash Patrol" +
                newLine + "Employer: A&B Cleaners" +
                newLine + "Location: Nevada" +
                newLine + "Position Type: Captain" +
                newLine + "Core Competency: Hawk-eyes" + newLine;

            String actualString = newJob1.toString();

            assertEquals(testString, actualString);
        }
        @Test
        public void testToStringHandlesEmptyField() {
            Job newJob2 = new Job("", new Employer("A&B Cleaners"), new Location("Nevada"), new PositionType(""), new CoreCompetency("Hawk-eyes"));

            String testString2 =
                    newLine + "ID: " + newJob2.getId() +
                    newLine + "Name: " + "Data not available" +
                    newLine + "Employer: A&B Cleaners" +
                    newLine + "Location: Nevada" +
                    newLine + "Position Type: Data not available" +
                    newLine + "Core Competency: Hawk-eyes" + newLine;

            String actualString2= newJob2.toString();

            assertEquals(testString2, actualString2);
        }
        @Test
        public void testForMsgWhenOnlyIdExists() {
            Job newJob3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            String actualString = newJob3.toString();
            assertEquals("OOPS! This job does not seem to exist.", actualString);
        }
}
