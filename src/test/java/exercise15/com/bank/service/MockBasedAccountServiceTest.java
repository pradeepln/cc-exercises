package exercise15.com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import exercise15.com.bank.dal.AccountDAO;
import exercise15.com.bank.dal.AccountDAOInMemoryImpl;

class MockBasedAccountServiceTest {

	private static final String SAVINGS_ACCOUNT_TYPE = "SA";

	//Fast, Independent, Repeatable, Self validating, Timely
	@Test
	void createNewAccount_Returns_Valid_Id_When_Balanace_GTEQ_MinBal() {
		//AAA
		//Arrange
		AccountService objectUnderTest = new AccountService();
		String typeParam = SAVINGS_ACCOUNT_TYPE;
		double balanceParam = AccountService.MIN_BAL + 1;
		
		AccountDAO mockDao = Mockito.mock(AccountDAO.class);
		Mockito.when(mockDao.create(Mockito.any())).thenReturn(10);
		objectUnderTest.setDao(mockDao);
		
		//Act
		int id = objectUnderTest.createNewAccount(typeParam, balanceParam);
		//Assert
		assertTrue(id > 0);
	}

}
