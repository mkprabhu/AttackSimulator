import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_attackSimulator_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
printHtmlPart(0)
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
printHtmlPart(1)
expressionOut.print(request.contextPath)
printHtmlPart(2)
expressionOut.print(g.message(code:'validation.empty.postfix'))
printHtmlPart(3)
expressionOut.print(g.message(code:'validation.atLeast.prefix'))
printHtmlPart(4)
expressionOut.print(g.message(code:'validation.atLeast.postfix'))
printHtmlPart(5)
expressionOut.print(g.message(code:'validation.email'))
printHtmlPart(6)
expressionOut.print(g.message(code:'validation.password'))
printHtmlPart(7)
expressionOut.print(g.message(code:'validation.selectPrefix'))
printHtmlPart(4)
expressionOut.print(g.message(code:'validation.atLeast.postfix'))
printHtmlPart(8)
expressionOut.print(g.message(code:'validation.duplicate'))
printHtmlPart(9)
expressionOut.print(g.message(code:'validation.node.notworking'))
printHtmlPart(10)
expressionOut.print(g.message(code:'validation.digits'))
printHtmlPart(11)
expressionOut.print(g.message(code:'validation.directory'))
printHtmlPart(12)
expressionOut.print(g.message(code:'validation.number'))
printHtmlPart(13)
expressionOut.print(g.message(code:'validation.min'))
printHtmlPart(14)
expressionOut.print(g.message(code:'validation.max'))
printHtmlPart(15)
expressionOut.print(g.message(code:'validation.max.pre'))
printHtmlPart(16)
expressionOut.print(g.message(code:'validation.max.post'))
printHtmlPart(17)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(18)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(20)
expressionOut.print(resource(dir: 'css', file: 'main_1.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'jquery-ui.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'jquery.ui.datepicker.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'jquery.sidr.dark.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'new_framework.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'nprogress.css'))
printHtmlPart(21)
expressionOut.print(resource(dir: 'css', file: 'jquery.ui.timepicker.css'))
printHtmlPart(22)
invokeTag('javascript','g',73,['library':("jquery")],-1)
printHtmlPart(23)
invokeTag('javascript','g',74,['library':("jquery-ui")],-1)
printHtmlPart(24)
invokeTag('layoutResources','r',75,[:],-1)
printHtmlPart(24)
invokeTag('layoutHead','g',76,[:],-1)
printHtmlPart(24)
invokeTag('javascript','g',77,['src':("nprogress.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',78,['src':("maingrails.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',79,['src':("jquery.sidr.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',80,['src':("jquery.ui.timepicker.js")],-1)
printHtmlPart(25)
expressionOut.print(resource(dir: 'images', file: 'grails_logo.png'))
printHtmlPart(26)
createTagBody(1, {->
printHtmlPart(23)
invokeTag('set','g',85,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(27)
expressionOut.print(user)
printHtmlPart(28)
invokeTag('currentUrl','g',193,[:],-1)
printHtmlPart(29)
createClosureForHtmlPart(30, 2)
invokeTag('userenvironmentknown','g',214,[:],2)
printHtmlPart(31)
createClosureForHtmlPart(32, 2)
invokeTag('userenvironmentknown','g',214,[:],2)
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('userhasorders','g',215,[:],2)
printHtmlPart(35)
createClosureForHtmlPart(32, 2)
invokeTag('userhasorders','g',215,[:],2)
printHtmlPart(36)
invokeTag('layoutBody','g',250,[:],-1)
printHtmlPart(37)
})
invokeTag('userloggedin','g',255,[:],1)
printHtmlPart(38)
invokeTag('layoutResources','r',266,[:],-1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1470811590000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
