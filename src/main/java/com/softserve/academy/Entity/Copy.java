package com.softserve.academy.Entity;

import java.sql.Date;

/**
 * Class representing Copy table in the Librarium database
 *
 * @author Olha Lozinska
 */
public class Copy {
    private int id;
    private Date createdAt;
    private User creatorId;
    private int publicationYear;
    private String publishingHouse;
    private boolean available;
    private Book bookId;
    private int ordersQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(User creatorId) {
        this.creatorId = creatorId;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public int getOrdersQuantity() {
        return ordersQuantity;
    }

    public void setOrdersQuantity(int ordersQuantity) {
        this.ordersQuantity = ordersQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Copy copy = (Copy) o;

        if (id != copy.id) {
            return false;
        }
        if (publicationYear != copy.publicationYear) {
            return false;
        }
        if (available != copy.available) {
            return false;
        }
        if (ordersQuantity != copy.ordersQuantity) {
            return false;
        }
        if (createdAt != null ? !createdAt.equals(copy.createdAt) : copy.createdAt != null) {
            return false;
        }
        if (creatorId != null ? !creatorId.equals(copy.creatorId) : copy.creatorId != null) {
            return false;
        }
        if (publishingHouse != null ? !publishingHouse.equals(copy.publishingHouse) : copy.publishingHouse != null) {
            return false;
        }
        return bookId != null ? bookId.equals(copy.bookId) : copy.bookId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (creatorId != null ? creatorId.hashCode() : 0);
        result = 31 * result + publicationYear;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        result = 31 * result + (available ? 1 : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + ordersQuantity;
        return result;
    }

    @Override
    public String toString() {
        return "Copy{" +
            "id=" + id +
            ", publicationYear=" + publicationYear +
            ", publishingHouse='" + publishingHouse + '\'' +
            ", available=" + available +
            ", bookId=" + bookId +
            '}';
    }
}
