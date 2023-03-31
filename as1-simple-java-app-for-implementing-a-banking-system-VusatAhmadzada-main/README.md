{VUSAT}_{AHMADZADA}_{14086}_{20285}
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10485751&assignment_repo_type=AssignmentRepo)
<h1> Assignment 1 </h1>
<h3> Creating a simple JAVA application to implement a Banking System. </h3>

Dear students,

In this assignment, you need to submit you work to implement a Banking System (we have partially completed it during the
classes).

<h3>Task Related - List of the required types</h3>
<ul>
    <li>(Abstract) Account class</li>
    <li>CheckingAccount (a subclass of the Account)</li>
    <li>SavingAccount (a subclass of the Account)</li>
    <li>Customer</li>
    <li>Bank</li>
</ul>

<h3>Task Related - Account class <strong>(10 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>id</em></strong> - (String)</li>
    <li><strong><em>balance</em></strong> - (BigDecimal) - (<em>note:</em> initial value is <strong>always</strong> set
        to zero)</li>
</ul>
<p>Methods:</p>
<ul>
    <li>a getter method for each field</li>
    <li><strong><em>deposit(BigDecimal amount)</em></strong> - deposits the amount to the balance</li>
    <li><strong><em>withdraw(BigDecimal amount)</em></strong> - withdraws the amount from the balance (an abstract
        method)</li>
</ul>

<h3>Task Related - CheckingAccount class <strong>(10 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>overDraftLimit</em></strong> - (BigDecimal) - (<em>note:</em> must be initialized through the
        constructor(s))</li>
</ul>
<p>Methods:</p>
<ul>
    <li>implementation of <strong><em>withdraw(BigDecimal amount)</em></strong> - withdraws the amount from the balance,
        allowing for overdraft up to the overdraft limit</li>
</ul>

<h3>Task Related - SavingAccount class <strong>(10 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>interestRate</em></strong> - (BigDecimal) - (<em>note:</em> must be initialized through the
        constructor(s))</li>
</ul>
<p>Methods:</p>
<ul>
    <li>implementation of <strong><em>withdraw(BigDecimal amount)</em></strong> - withdraws the amount from the balance,
        as long as the balance is greater than the withdrawal amount</li>
</ul>

<h3>Task Related - Customer class <strong>(20 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>id</em></strong> - (String)</li>
    <li><strong><em>fullName</em></strong> - (String)</li>
    <li><strong><em>accounts</em></strong> - (List<Account>)</li>
</ul>
<p>Methods:</p>
<ul>
    <li>a getter method for each field</li>
    <li><strong><em>addAccount(Account account)</em></strong> - adds the specified account to the customer's list of
        accounts</li>
    <li><strong><em>removeAccount(Account account)</em></strong> - removes the specified account from the customer's
        list of accounts</li>
    <li><strong><em>removeAccount(String accountId)</em></strong> - removes the account with the specified id from the
        customer's list of accounts</li>
    <li><strong><em>getTotalBalance()</em></strong> - returns the total balance of the customer considering all accounts
    </li>
    <li><strong><em>getAccounts(String type)</em></strong> - returns the (list) accounts of the customer based on the
        type: <em>checking</em> or <em>saving</em></li>
</ul>

<h3>Task Related - Banking class <strong>(30 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>customers</em></strong> - (List<Customer>)</li>
</ul>
<p>Methods:</p>
<ul>
    <li><strong><em>addCustomer(Customer customer)</em></strong> - adds the specified customer to the bank's list of
        customers</li>
    <li><strong><em>removeCustomer(Customer customer)</em></strong> - removes the specified customer from the bank's
        list of customers</li>
    <li><strong><em>removeCustomer(String customerId)</em></strong> - removes the customer with the specified id from
        the bank's list of customers</li>
    <li><strong><em>getCustomers()</em></strong> - returns the bank's list of customers</li>
    <li><strong><em>getCustomer(String customerId)</em></strong> - returns the customer with the specified id</li>
    <li><strong><em>createCheckingAccount(Customer customer, BigDecimal balance, BigDecimal
                overDraftLimit)</em></strong> -
        creates a new checking account for the specified customer with the specified initial balance and overdraft limit
    </li>
    <li><strong><em>createSavingAccount(Customer customer, BigDecimal balance, BigDecimal interestRate)</em></strong> -
        creates a new savings account for the specified customer with the specified initial balance and interest rate
    </li>
    <li>All the IDs are always generated within constructors. Do not generate an id and set to a newly instantiated
        object.</li>
</ul>

<h3>Task Related - Exception handling <strong>(10 %)</strong></h3>
<ul>
    <li>Please, carefully follow the instructions above.</li>
    <li>Your program should properly enforce encapsulation, inheritance, abstraction and association.</li>
    <li>Your program should prevent invalid operations using proper exceptions and exception handling. Some of them are
        the following:
        <ul>
            <li>depositing an account a negative amount</li>
            <li>in the subclasses of the Account class withdrawing more than allowed</li>
            <li>attempting to remove an account that does not exist from a customer</li>
            <li>attempting to remove a customer that does not exist from a bank</li>
            <li>attempting to retrieve a customer that does not exist from a bank</li>
        </ul>
    </li>
</ul>

<h3>Task Related - Testing all together <strong>(10 %)</strong></h3>
You will need to define a <strong><em>BankingDemo</em></strong> class which demonstrates all the functionality of
yourprogram. However, it is strongly encouraged to test each class and each method as soon as they are completed to have
less errors and easy debugging in the end. <br />
When you compile, make sure your .class files are totally isolated from the rest and are never commited and pushed.

<h3>Task Related - Class diagrams <strong>(5 %)</strong></h3>
Draw the class diagrams including all the association and relations among the classes. Add the image(s) to the project
folder so that they are submitted to the repository as well. You may use any tool to draw the diagrams. Make sure you
submit image format (.jpg or .png).

<h4>Important notes:</h4>
- Codes that do not compile and run will not be graded. <br />
- Please, also refer to the course syllabus about the assignments. <br />
- Each completed feature must be commited and pushed. <br />
- This assignment will give you <strong><em>10 %</em></strong> of the overall. <br />