// /*
//  * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//collections/src/java/org/apache/commons/collections/buffer/CircularFifoBuffer.java,v 1.1 2003/11/29 18:04:57 scolebourne Exp $
//  * ====================================================================
//  *
//  * The Apache Software License, Version 1.1
//  *
//  * Copyright (c) 2003 The Apache Software Foundation.  All rights
//  * reserved.
//  *
//  * Redistribution and use in source and binary forms, with or without
//  * modification, are permitted provided that the following conditions
//  * are met:
//  *
//  * 1. Redistributions of source code must retain the above copyright
//  *    notice, this list of conditions and the following disclaimer.
//  *
//  * 2. Redistributions in binary form must reproduce the above copyright
//  *    notice, this list of conditions and the following disclaimer in
//  *    the documentation and/or other materials provided with the
//  *    distribution.
//  *
//  * 3. The end-user documentation included with the redistribution, if
//  *    any, must include the following acknowledgement:
//  *       "This product includes software developed by the
//  *        Apache Software Foundation (http://www.apache.org/)."
//  *    Alternately, this acknowledgement may appear in the software itself,
//  *    if and wherever such third-party acknowledgements normally appear.
//  *
//  * 4. The names "The Jakarta Project", "Commons", and "Apache Software
//  *    Foundation" must not be used to endorse or promote products derived
//  *    from this software without prior written permission. For written
//  *    permission, please contact apache@apache.org.
//  *
//  * 5. Products derived from this software may not be called "Apache"
//  *    nor may "Apache" appear in their names without prior written
//  *    permission of the Apache Software Foundation.
//  *
//  * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
//  * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
//  * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//  * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
//  * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
//  * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
//  * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
//  * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
//  * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
//  * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
//  * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
//  * SUCH DAMAGE.
//  * ====================================================================
//  *
//  * This software consists of voluntary contributions made by many
//  * individuals on behalf of the Apache Software Foundation.  For more
//  * information on the Apache Software Foundation, please see
//  * <http://www.apache.org/>.
//  *
//  */
// package main;

// import java.util.Collection;

// /** 
//  * CircularFifoBuffer is a first in first out buffer with a fixed size that
//  * replaces its oldest element if full.
//  * <p>
//  * The removal order of a <code>CircularFifoBuffer</code> is based on the 
//  * insertion order; elements are removed in the same order in which they
//  * were added.  The iteration order is the same as the removal order.
//  * <p>
//  * The {@link #add(Object)}, {@link #remove()} and {@link #get()} operations
//  * all perform in constant time.  All other operations perform in linear
//  * time or worse.
//  * <p>
//  * Note that this implementation is not synchronized.  The following can be
//  * used to provide synchronized access to your <code>CircularFifoBuffer</code>:
//  * <pre>
//  *   Buffer fifo = BufferUtils.synchronizedBuffer(new CircularFifoBuffer());
//  * </pre>
//  * <p>
//  * This buffer prevents null objects from being added.
//  * 
//  * @since Commons Collections 3.0
//  * @version $Revision: 1.1 $ $Date: 2003/11/29 18:04:57 $
//  * 
//  * @author Stefano Fornari
//  * @author Stephen Colebourne
//  */
// public class CircularFifoBuffer extends BoundedFifoBuffer {

//     /**
//      * Constructor that creates a buffer with the default size of 32.
//      */
//     public CircularFifoBuffer() {
//         super(32);
//     }

//     /**
//      * Constructor that creates a buffer with the specified size.
//      * 
//      * @param size  the size of the buffer (cannot be changed)
//      * @throws IllegalArgumentException  if the size is less than 1
//      */
//     public CircularFifoBuffer(int size) {
//         super(size);
//     }

//     /**
//      * Constructor that creates a buffer from the specified collection.
//      * The collection size also sets the buffer size
//      * 
//      * @param coll  the collection to copy into the buffer, may not be null
//      * @throws NullPointerException if the collection is null
//      */
//     public CircularFifoBuffer(Collection coll) {
//         super(coll);
//     }

//     /**
//      * If the buffer is full, the least recently added element is discarded so
//      * that a new element can be inserted.
//      *
//      * @param element the element to add
//      * @return true, always
//      */
//     public boolean add(Object element) {
//         if (isFull()) {
//             remove();
//         }
//         return super.add(element);
//     }
    
// }
