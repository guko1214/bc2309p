package com.bootcamp.javacode.model;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class Job {
  
  private LocalDate startDate;

  private LocalDate deadline;

  public static void main(String[] args) {
    Job job = new Job(LocalDate.of(2024,01,06),LocalDate.of(2024,02,04));
    System.out.println(job.getStartDate());
    System.out.println(job.getDeadline());
    System.out.println(job);
    Job job2 = new Job(LocalDate.of(2024,01,06), LocalDate.of(2024,02,06));
    System.out.println(job2);
    System.out.println(job.equals(job2));
    Job job3 = new Job(LocalDate.of(2024,01,06), LocalDate.of(2024,02,04));
    System.out.println(job3);
    System.out.println(job.equals(job3));


    Job job4 = Job.builder() //
      .startDate(LocalDate.of(2023,1,23)) // 
      .deadline(LocalDate.of(2023,12,31)) //
      .build();

    Job job5 = Job.builder().build();
  }

}
