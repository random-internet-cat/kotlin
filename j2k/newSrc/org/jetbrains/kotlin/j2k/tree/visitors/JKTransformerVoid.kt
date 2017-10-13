package org.jetbrains.kotlin.j2k.tree.visitors

import org.jetbrains.kotlin.j2k.tree.*

interface JKTransformerVoid : JKTransformer<Nothing?> {
    fun <E: JKElement> transformElement(element: JKElement): E 
    override fun <E: JKElement> transformElement(element: JKElement, data: Nothing?): E = transformElement(element)
    fun <E: JKClass> transformClass(klass: JKClass): E = transformDeclaration(klass, null)
    override fun <E: JKClass> transformClass(klass: JKClass, data: Nothing?): E = transformClass(klass)
    fun <E: JKStatement> transformStatement(statement: JKStatement): E = transformElement(statement, null)
    override fun <E: JKStatement> transformStatement(statement: JKStatement, data: Nothing?): E = transformStatement(statement)
    fun <E: JKExpression> transformExpression(expression: JKExpression): E = transformStatement(expression, null)
    override fun <E: JKExpression> transformExpression(expression: JKExpression, data: Nothing?): E = transformExpression(expression)
    fun <E: JKLoop> transformLoop(loop: JKLoop): E = transformStatement(loop, null)
    override fun <E: JKLoop> transformLoop(loop: JKLoop, data: Nothing?): E = transformLoop(loop)
    fun <E: JKDeclaration> transformDeclaration(declaration: JKDeclaration): E = transformElement(declaration, null)
    override fun <E: JKDeclaration> transformDeclaration(declaration: JKDeclaration, data: Nothing?): E = transformDeclaration(declaration)
    fun <E: JKBlock> transformBlock(block: JKBlock): E = transformElement(block, null)
    override fun <E: JKBlock> transformBlock(block: JKBlock, data: Nothing?): E = transformBlock(block)
    fun <E: JKCall> transformCall(call: JKCall): E = transformExpression(call, null)
    override fun <E: JKCall> transformCall(call: JKCall, data: Nothing?): E = transformCall(call)
    fun <E: JKIdentifier> transformIdentifier(identifier: JKIdentifier): E = transformElement(identifier, null)
    override fun <E: JKIdentifier> transformIdentifier(identifier: JKIdentifier, data: Nothing?): E = transformIdentifier(identifier)
    fun <E: JKTypeIdentifier> transformTypeIdentifier(typeIdentifier: JKTypeIdentifier): E = transformIdentifier(typeIdentifier, null)
    override fun <E: JKTypeIdentifier> transformTypeIdentifier(typeIdentifier: JKTypeIdentifier, data: Nothing?): E = transformTypeIdentifier(typeIdentifier)
    fun <E: JKNameIdentifier> transformNameIdentifier(nameIdentifier: JKNameIdentifier): E = transformIdentifier(nameIdentifier, null)
    override fun <E: JKNameIdentifier> transformNameIdentifier(nameIdentifier: JKNameIdentifier, data: Nothing?): E = transformNameIdentifier(nameIdentifier)
    fun <E: JKLiteralExpression> transformLiteralExpression(literalExpression: JKLiteralExpression): E = transformExpression(literalExpression, null)
    override fun <E: JKLiteralExpression> transformLiteralExpression(literalExpression: JKLiteralExpression, data: Nothing?): E = transformLiteralExpression(literalExpression)
    fun <E: JKModifierList> transformModifierList(modifierList: JKModifierList): E = transformElement(modifierList, null)
    override fun <E: JKModifierList> transformModifierList(modifierList: JKModifierList, data: Nothing?): E = transformModifierList(modifierList)
    fun <E: JKModifier> transformModifier(modifier: JKModifier): E = transformElement(modifier, null)
    override fun <E: JKModifier> transformModifier(modifier: JKModifier, data: Nothing?): E = transformModifier(modifier)
    fun <E: JKAccessModifier> transformAccessModifier(accessModifier: JKAccessModifier): E = transformModifier(accessModifier, null)
    override fun <E: JKAccessModifier> transformAccessModifier(accessModifier: JKAccessModifier, data: Nothing?): E = transformAccessModifier(accessModifier)
    fun <E: JKJavaField> transformJavaField(javaField: JKJavaField): E = transformDeclaration(javaField, null)
    override fun <E: JKJavaField> transformJavaField(javaField: JKJavaField, data: Nothing?): E = transformJavaField(javaField)
    fun <E: JKJavaMethod> transformJavaMethod(javaMethod: JKJavaMethod): E = transformDeclaration(javaMethod, null)
    override fun <E: JKJavaMethod> transformJavaMethod(javaMethod: JKJavaMethod, data: Nothing?): E = transformJavaMethod(javaMethod)
    fun <E: JKJavaForLoop> transformJavaForLoop(javaForLoop: JKJavaForLoop): E = transformLoop(javaForLoop, null)
    override fun <E: JKJavaForLoop> transformJavaForLoop(javaForLoop: JKJavaForLoop, data: Nothing?): E = transformJavaForLoop(javaForLoop)
    fun <E: JKJavaAssignmentExpression> transformJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression): E = transformExpression(javaAssignmentExpression, null)
    override fun <E: JKJavaAssignmentExpression> transformJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression, data: Nothing?): E = transformJavaAssignmentExpression(javaAssignmentExpression)
    fun <E: JKJavaCall> transformJavaCall(javaCall: JKJavaCall): E = transformCall(javaCall, null)
    override fun <E: JKJavaCall> transformJavaCall(javaCall: JKJavaCall, data: Nothing?): E = transformJavaCall(javaCall)
    fun <E: JKJavaTypeIdentifier> transformJavaTypeIdentifier(javaTypeIdentifier: JKJavaTypeIdentifier): E = transformTypeIdentifier(javaTypeIdentifier, null)
    override fun <E: JKJavaTypeIdentifier> transformJavaTypeIdentifier(javaTypeIdentifier: JKJavaTypeIdentifier, data: Nothing?): E = transformJavaTypeIdentifier(javaTypeIdentifier)
    fun <E: JKJavaStringLiteralExpression> transformJavaStringLiteralExpression(javaStringLiteralExpression: JKJavaStringLiteralExpression): E = transformLiteralExpression(javaStringLiteralExpression, null)
    override fun <E: JKJavaStringLiteralExpression> transformJavaStringLiteralExpression(javaStringLiteralExpression: JKJavaStringLiteralExpression, data: Nothing?): E = transformJavaStringLiteralExpression(javaStringLiteralExpression)
    fun <E: JKJavaAccessModifier> transformJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier): E = transformAccessModifier(javaAccessModifier, null)
    override fun <E: JKJavaAccessModifier> transformJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier, data: Nothing?): E = transformJavaAccessModifier(javaAccessModifier)
    fun <E: JKKtFun> transformKtFun(ktFun: JKKtFun): E = transformDeclaration(ktFun, null)
    override fun <E: JKKtFun> transformKtFun(ktFun: JKKtFun, data: Nothing?): E = transformKtFun(ktFun)
    fun <E: JKKtConstructor> transformKtConstructor(ktConstructor: JKKtConstructor): E = transformDeclaration(ktConstructor, null)
    override fun <E: JKKtConstructor> transformKtConstructor(ktConstructor: JKKtConstructor, data: Nothing?): E = transformKtConstructor(ktConstructor)
    fun <E: JKKtPrimaryConstructor> transformKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor): E = transformKtConstructor(ktPrimaryConstructor, null)
    override fun <E: JKKtPrimaryConstructor> transformKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor, data: Nothing?): E = transformKtPrimaryConstructor(ktPrimaryConstructor)
    fun <E: JKKtAssignmentStatement> transformKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement): E = transformStatement(ktAssignmentStatement, null)
    override fun <E: JKKtAssignmentStatement> transformKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement, data: Nothing?): E = transformKtAssignmentStatement(ktAssignmentStatement)
    fun <E: JKKtCall> transformKtCall(ktCall: JKKtCall): E = transformCall(ktCall, null)
    override fun <E: JKKtCall> transformKtCall(ktCall: JKKtCall, data: Nothing?): E = transformKtCall(ktCall)
}
