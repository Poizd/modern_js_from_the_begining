package patientintake;

import org.junit.jupiter.api.*;

import javax.print.attribute.standard.JobImpressions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarShould {

   private ClinicCalendar calendar;
   @BeforeAll
   static  void testClassSetup() {
      System.out.println("Before all...");
   }
   @BeforeEach
   void init() {
      System.out.println("Before each...");
      calendar = new ClinicCalendar(LocalDate.of(2024, 1,5));
   }
   @Test
   void allowEntryOfAnAppointment() {
      System.out.println("entry of employment...");
      calendar.addAppointment("Jim", "Weaver", "avery",
         "09/01/2018 2:00 pm");
      List<PatientAppointment> appointments = calendar.getAppointments();
      assertNotNull(appointments);
      assertEquals(1, appointments.size());
      PatientAppointment enteredAppt = appointments.get(0);

      assertAll(
              () -> assertEquals("Jim", enteredAppt.getPatientFirstName()),
              () -> assertEquals("Weaver", enteredAppt.getPatientLastName()),
              () -> assertSame(Doctor.avery, enteredAppt.getDoctor()),
              () -> assertEquals("9/1/2018 02:00 PM",
         enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a", Locale.US)))
   );
   }

   @Test
   void returnTruForHasAppointmentsThereAreAppointments() {
      System.out.println("true for has appointment...");
      calendar.addAppointment("Jim", "Weaver", "avery", "09/01/2018 2:00 pm");
      assertTrue(calendar.hasAppointment(LocalDate.of(2018,9,1)));
   }
   @Test
   void returnFalseForHasAppointmentsThereAreAppointments() {
      System.out.println("false for has appointment...");
      ClinicCalendar calendar = new ClinicCalendar(LocalDate.now());
      assertFalse(calendar.hasAppointment(LocalDate.of(2018,9,1)));
   }
   @Test
   void returnCurrentDaysAppointments() {
      System.out.println("current day appointment...");
      calendar.addAppointment("Jim", "Weaver", "avery", "01/05/2024 2:00 pm");
      calendar.addAppointment("Jim", "Weaver", "avery", "01/05/2024 2:00 pm");
      calendar.addAppointment("Jim", "Weaver", "avery", "01/06/2024 2:00 pm");
      assertEquals(2, calendar.getTodayAppointments().size());
   }

   @AfterEach
   void testClassOut() {
      System.out.println("After Each...");
   }

   @AfterAll
   static void testAfterAll() {
      System.out.println("After All....");
   }
}