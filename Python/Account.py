class BankAccount:
    def __init__(self):
        self.accountNum = 0
        self.accountOwner = ""
        self.accountBalance = 0.00
    
    def ModifyAccount(self, id, name, balance):
        self.accountNum = id
        self.accountOwner = name
        self.accountBalance = balance

account = BankAccount()

account.ModifyAccount(12345, "John Doe", 123456.78)
print("Account ID: {}, Name: {}, Balance: ${}".format(account.accountNum, account.accountOwner, account.accountBalance))