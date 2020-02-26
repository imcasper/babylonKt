package platform

import kotlin.Number

//external interface ConcatArray<T> {
//	var length: Number
//	@nativeGetter
//	operator fun get(n: Number): T?
//	@nativeSetter
//	operator fun set(n: Number, value: T)
//	fun join(separator: String = definedExternally): String
//	fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
//}
//
//external interface Array<T> {
//	var length: Number
//	override fun toString(): String
//	fun toLocaleString(): String
//	fun pop(): T?
//	fun push(vararg items: T): Number
//	fun concat(vararg items: ConcatArray<T>): Array<T>
//	fun concat(vararg items: T): Array<T>
//	fun join(separator: String = definedExternally): String
//	fun reverse(): Array<T>
//	fun shift(): T?
//	fun slice(start: Number = definedExternally, end: Number = definedExternally): Array<T>
//	fun sort(compareFn: (a: T, b: T) -> Number = definedExternally): Array<T> /* this */
//	fun splice(start: Number, deleteCount: Number = definedExternally): Array<T>
//	fun splice(start: Number, deleteCount: Number, vararg items: T): Array<T>
//	fun unshift(vararg items: T): Number
//	fun indexOf(searchElement: T, fromIndex: Number = definedExternally): Number
//	fun lastIndexOf(searchElement: T, fromIndex: Number = definedExternally): Number
//	fun every(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Boolean
//	fun some(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Boolean
//	fun forEach(callbackfn: (value: T, index: Number, array: Array<T>) -> Unit, thisArg: Any = definedExternally)
//	fun <U> map(callbackfn: (value: T, index: Number, array: Array<T>) -> U, thisArg: Any = definedExternally): Array<U>
//	fun <S : T> filter(callbackfn: (value: T, index: Number, array: Array<T>) -> Boolean, thisArg: Any = definedExternally): Array<S>
//	fun filter(callbackfn: (value: T, index: Number, array: Array<T>) -> Any, thisArg: Any = definedExternally): Array<T>
//	fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T): T
//	fun reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T, initialValue: T): T
//	fun <U> reduce(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Array<T>) -> U, initialValue: U): U
//	fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T): T
//	fun reduceRight(callbackfn: (previousValue: T, currentValue: T, currentIndex: Number, array: Array<T>) -> T, initialValue: T): T
//	fun <U> reduceRight(callbackfn: (previousValue: U, currentValue: T, currentIndex: Number, array: Array<T>) -> U, initialValue: U): U
//	@nativeGetter
//	operator fun get(n: Number): T?
//	@nativeSetter
//	operator fun set(n: Number, value: T)
//	fun concat(items: ConcatArray<T>): Array<T>
//}