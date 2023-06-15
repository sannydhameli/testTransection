package com.example.Erik.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;


@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private CompanyLedgerMaster company;
  private BranchMaster branch;
  private DepartmentMaster department;
  private String transactionNumber;
  private TransactionStatus transactionStatus;
  private String remarks;
  private List<Long> lineItems;
}
