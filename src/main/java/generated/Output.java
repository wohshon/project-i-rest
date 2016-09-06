
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="attributes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="relationships">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="author">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="author_data">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="author_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="author_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="included">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="incl_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="incl_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="attributes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data",
    "included"
})
@XmlRootElement(name = "output")
public class Output {

    @XmlElement(required = true)
    protected Output.Data data;
    @XmlElement(required = true)
    protected Output.Included included;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Output.Data }
     *     
     */
    public Output.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Output.Data }
     *     
     */
    public void setData(Output.Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link Output.Included }
     *     
     */
    public Output.Included getIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link Output.Included }
     *     
     */
    public void setIncluded(Output.Included value) {
        this.included = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="attributes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="relationships">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="author">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="author_data">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="author_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="author_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "id",
        "attributes",
        "relationships"
    })
    public static class Data {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String id;
        @XmlElement(required = true)
        protected Output.Data.Attributes attributes;
        @XmlElement(required = true)
        protected Output.Data.Relationships relationships;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link Output.Data.Attributes }
         *     
         */
        public Output.Data.Attributes getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Output.Data.Attributes }
         *     
         */
        public void setAttributes(Output.Data.Attributes value) {
            this.attributes = value;
        }

        /**
         * Gets the value of the relationships property.
         * 
         * @return
         *     possible object is
         *     {@link Output.Data.Relationships }
         *     
         */
        public Output.Data.Relationships getRelationships() {
            return relationships;
        }

        /**
         * Sets the value of the relationships property.
         * 
         * @param value
         *     allowed object is
         *     {@link Output.Data.Relationships }
         *     
         */
        public void setRelationships(Output.Data.Relationships value) {
            this.relationships = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "body",
            "created",
            "updated"
        })
        public static class Attributes {

            @XmlElement(required = true)
            protected String title;
            @XmlElement(required = true)
            protected String body;
            @XmlElement(required = true)
            protected String created;
            @XmlElement(required = true)
            protected String updated;

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the body property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBody() {
                return body;
            }

            /**
             * Sets the value of the body property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBody(String value) {
                this.body = value;
            }

            /**
             * Gets the value of the created property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreated() {
                return created;
            }

            /**
             * Sets the value of the created property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreated(String value) {
                this.created = value;
            }

            /**
             * Gets the value of the updated property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpdated() {
                return updated;
            }

            /**
             * Sets the value of the updated property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpdated(String value) {
                this.updated = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="author">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="author_data">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="author_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="author_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "author"
        })
        public static class Relationships {

            @XmlElement(required = true)
            protected Output.Data.Relationships.Author author;

            /**
             * Gets the value of the author property.
             * 
             * @return
             *     possible object is
             *     {@link Output.Data.Relationships.Author }
             *     
             */
            public Output.Data.Relationships.Author getAuthor() {
                return author;
            }

            /**
             * Sets the value of the author property.
             * 
             * @param value
             *     allowed object is
             *     {@link Output.Data.Relationships.Author }
             *     
             */
            public void setAuthor(Output.Data.Relationships.Author value) {
                this.author = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="author_data">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="author_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="author_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "authorData"
            })
            public static class Author {

                @XmlElement(name = "author_data", required = true)
                protected Output.Data.Relationships.Author.AuthorData authorData;

                /**
                 * Gets the value of the authorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Output.Data.Relationships.Author.AuthorData }
                 *     
                 */
                public Output.Data.Relationships.Author.AuthorData getAuthorData() {
                    return authorData;
                }

                /**
                 * Sets the value of the authorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Output.Data.Relationships.Author.AuthorData }
                 *     
                 */
                public void setAuthorData(Output.Data.Relationships.Author.AuthorData value) {
                    this.authorData = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="author_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="author_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "authorId",
                    "authorType"
                })
                public static class AuthorData {

                    @XmlElement(name = "author_id", required = true)
                    protected String authorId;
                    @XmlElement(name = "author_type", required = true)
                    protected String authorType;

                    /**
                     * Gets the value of the authorId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAuthorId() {
                        return authorId;
                    }

                    /**
                     * Sets the value of the authorId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAuthorId(String value) {
                        this.authorId = value;
                    }

                    /**
                     * Gets the value of the authorType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAuthorType() {
                        return authorType;
                    }

                    /**
                     * Sets the value of the authorType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAuthorType(String value) {
                        this.authorType = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="incl_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="incl_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="attributes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inclType",
        "inclId",
        "attributes"
    })
    public static class Included {

        @XmlElement(name = "incl_type", required = true)
        protected String inclType;
        @XmlElement(name = "incl_id", required = true)
        protected String inclId;
        @XmlElement(required = true)
        protected Output.Included.Attributes attributes;

        /**
         * Gets the value of the inclType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInclType() {
            return inclType;
        }

        /**
         * Sets the value of the inclType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInclType(String value) {
            this.inclType = value;
        }

        /**
         * Gets the value of the inclId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInclId() {
            return inclId;
        }

        /**
         * Sets the value of the inclId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInclId(String value) {
            this.inclId = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link Output.Included.Attributes }
         *     
         */
        public Output.Included.Attributes getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Output.Included.Attributes }
         *     
         */
        public void setAttributes(Output.Included.Attributes value) {
            this.attributes = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "age",
            "gender"
        })
        public static class Attributes {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String age;
            @XmlElement(required = true)
            protected String gender;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAge(String value) {
                this.age = value;
            }

            /**
             * Gets the value of the gender property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGender() {
                return gender;
            }

            /**
             * Sets the value of the gender property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGender(String value) {
                this.gender = value;
            }

        }

    }

}
