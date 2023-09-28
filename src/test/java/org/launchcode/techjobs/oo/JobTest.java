package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
@Test
    public void testSettingJobId() {
        Job firstJob = new Job();
        Job secondJob = new Job();

        assertNotEquals(firstJob.getId(), secondJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job  theJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(theJob instanceof Job);
        assertTrue(theJob.getName() instanceof String);
        assertTrue(theJob.getEmployer() instanceof Employer);
        assertTrue(theJob.getLocation() instanceof Location);
        assertTrue(theJob.getPositionType() instanceof PositionType);
        assertTrue(theJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", theJob.getName());
        assertEquals("ACME", theJob.getEmployer().getValue());
        assertEquals("Desert", theJob.getLocation().getValue());
        assertEquals("Quality control", theJob.getPositionType().getValue());
        assertEquals("Persistence", theJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job firstJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(firstJob.equals(secondJob));
    }


}
