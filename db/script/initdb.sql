create table public."book"(
    book_id serial constraint "PK_Book" primary key,
    book_title varchar not null,
    book_author varchar not null
)
