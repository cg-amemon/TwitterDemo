package org.grails.twitter

import org.grails.twitter.Person

class Status {
    String message
    Person author
    Date dateCreated

    transient jmsService
    transient afterInsert = {
        //jmsService.send 'grailstwitter.status', author.username
    }
}
