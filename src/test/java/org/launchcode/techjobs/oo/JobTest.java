package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingsJobId() {
        Job newJob1 = new Job();
        Job newJob2 = new Job();
        assertNotEquals(newJob1, newJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //check String is not null
        assertTrue(newJob1.getName() instanceof String);
        assertEquals("Product tester", newJob1.getName());
        //checking employer
        assertTrue(newJob1.getEmployer() instanceof Employer);
        assertEquals("ACME", newJob1.getEmployer().getValue());
        //checking location
        assertTrue(newJob1.getLocation() instanceof Location);
        assertEquals("Desert", newJob1.getLocation().getValue());
        //checking positionType
        assertTrue(newJob1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", newJob1.getPositionType().getValue());
        //checking CoreCompetency
        assertTrue(newJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", newJob1.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job newJob1 = new Job("Trash Patrol", new Employer("A&B Cleaners"), new Location("Nevada"), new PositionType("Captain"), new CoreCompetency("Hawkeyes"));
        Job newJob2 = new Job("Trash Patrol", new Employer("A&B Cleaners"), new Location("Nevada"), new PositionType("Captain"), new CoreCompetency("Hawkeyes"));
        assertNotEquals(newJob1, newJob2);
    }
}
