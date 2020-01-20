/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.app.playhvz.firebase.firebaseprovider

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import io.mockk.mockkClass

class AttemptedFirebaseProvider {
    companion object {
        private var firebaseAuth: FirebaseAuth? = null
        private var firebaseFirestore: FirebaseFirestore? = null

        /** Returns a valid firebaseAuth instance. */
        fun getFirebaseAuth(): FirebaseAuth {
            if (firebaseAuth == null) {
                println("lizard - mocking firebase auth")
                firebaseAuth = mockkClass(FirebaseAuth::class)
            }
            println("lizard - reusing firebase auth")
            return firebaseAuth!!
        }

        /** Returns a valid firebaseFirestore instance. */
        fun getFirebaseFirestore(): FirebaseFirestore {
            if (firebaseFirestore == null) {
                println("lizard - mocking firebase firestore")
                firebaseFirestore = mockkClass(FirebaseFirestore::class)
            }
            println("lizard - reusing firebase firestore")
            return firebaseFirestore!!
        }

    }
}