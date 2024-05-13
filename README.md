<h2>REST APIs Library Management System using Spring Boot</h2>

Rest Client should be able to:
<ol>
  <li>Create a new user</li>
  <li>Fetch all the Users</li>
  <li>Add new book</li>
  <li>Fetch all the books</li>
  <li>Fetch specific book</li>
  <li>Update a book</li>
  <li>Delete a book</li>
  <li>Borrow a book</li>
  <li>Return a book</li>
</ol>

REST APIs for User Resource:

|  HTTP Method |  URL Path  |  Status Code  |    Description    |
| :------------|:-----------| :-------------| :-----------------|
| Post         | /api/users | 201 (Created) | Create a new user |
| Get          | /api/users | 200 (OK)      | Get all the users |

REST APIs for Book Resource:

|  HTTP Method |               URL Path             |   Status Code  |      Description      |
| :------------|:-----------------------------------| :--------------| :---------------------|
| Get          | /api/books                         |  200 (OK)      | Get all the books     |
| Get          | /api/books/{id}                    |  200 (OK)      | Get the specific book |
| Post         | /api/books                         |  201 (Created) | Add the new book      |
| Put          | /api/books/{id}                    |  200 (OK)      | Update a book         |
| Delete       | /api/books/{id}                    |  200 (OK)      | Delete a book         |
| Post         | /api/books/{bookId}/borrow/{userId}|  201 (Created) | Borrow a book         |
| Post         | /api/books/{bookId}/return         |  201 (Created) | Return a book         |
